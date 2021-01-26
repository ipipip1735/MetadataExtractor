import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.lang.GeoLocation;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifIFD0Directory;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import com.drew.metadata.exif.GpsDirectory;
import com.drew.metadata.file.FileSystemDirectory;
import com.drew.metadata.xmp.XmpDirectory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2021/1/25 14:22.
 */
public class ImageMetData {

    public static void main(String[] args) {
        ImageMetData imageMetData = new ImageMetData();

        try {
            imageMetData.getMetData("res/kfly_real_2021-01-260045.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ImageProcessingException e) {
            e.printStackTrace();
        }


//        System.out.println(getUniqueKey());

    }

    public static  synchronized String getUniqueKey(){
        Random random = new Random();
        Integer a = random.nextInt(900000) + 100000;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyMMddHHmmssSSS");
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(simpleDateFormat.format(new Date()));
        stringBuffer.append(a);
        return  stringBuffer.toString();
    }




    //提取图像元数据
    public  void getMetData(String imgPath) throws IOException, NullPointerException, ImageProcessingException {
        ImgMeta entity = new ImgMeta();

        Metadata metadata = JpegMetadataReader.readMetadata(new File(imgPath));

        System.out.println("data: -----------" + metadata);

        //IFDO-----------------------------------------------
        ExifIFD0Directory directory = metadata.getFirstDirectoryOfType(ExifIFD0Directory.class);

        entity.setMake(directory.getString(ExifIFD0Directory.TAG_MAKE));

        entity.setModel(directory.getString(ExifIFD0Directory.TAG_MODEL));

        String datestr = directory.getString(ExifIFD0Directory.TAG_DATETIME);

        String replace = datestr.replaceFirst(":", "-");
        String replace1 = replace.replaceFirst(":", "-");
        entity.setTime(replace1);


        //SUBIFDO-----------------------------------------------
        ExifSubIFDDirectory subDirectory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);

        entity.setDateTimeDigitized(subDirectory.getString(ExifSubIFDDirectory.TAG_DATETIME_DIGITIZED));


        String originalDate = subDirectory.getString(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
        String re = datestr.replaceFirst(":", "-");
        String re2 = replace.replaceFirst(":", "-");
        entity.setDateTimeOriginal(re2);

        entity.setImgHeight(subDirectory.getString(ExifSubIFDDirectory.TAG_EXIF_IMAGE_HEIGHT));


        entity.setImgWidth(subDirectory.getString(ExifSubIFDDirectory.TAG_EXIF_IMAGE_WIDTH));


        entity.setFocalLength(subDirectory.getString(ExifSubIFDDirectory.TAG_FOCAL_LENGTH));


        entity.setGpsVersionId(subDirectory.getString(ExifSubIFDDirectory.TAG_EXIF_VERSION));


        //GPS-----------------------------------------------------
        GpsDirectory gpsDirectory = metadata.getFirstDirectoryOfType(GpsDirectory.class);

        GeoLocation geoLocation = gpsDirectory.getGeoLocation();
        double latitude = geoLocation.getLatitude();
        double longitude = geoLocation.getLongitude();
        /* Gps gps =TransferUtils.gps84_To_Gcj02(longitude,latitude);*/

        XmpDirectory xmpDirectory = metadata.getFirstDirectoryOfType(XmpDirectory.class);
        Map<String, String> xmpProperties = xmpDirectory.getXmpProperties();
        float relativeAltitude = Float.parseFloat(xmpProperties.get("drone-dji:RelativeAltitude"));
        float absoluteAltitude = Float.parseFloat(xmpProperties.get("drone-dji:AbsoluteAltitude"));
        float gimbalRollDegree = Float.parseFloat(xmpProperties.get("drone-dji:GimbalRollDegree"));
        float gimbalYawDegree = Float.parseFloat(xmpProperties.get("drone-dji:GimbalYawDegree"));
        float gimbalPitchDegree = Float.parseFloat(xmpProperties.get("drone-dji:GimbalPitchDegree"));
        float flightRollDegree = Float.parseFloat(xmpProperties.get("drone-dji:FlightRollDegree"));
        float flightYawDegree = Float.parseFloat(xmpProperties.get("drone-dji:FlightYawDegree"));
        float flightPitchDegree = Float.parseFloat(xmpProperties.get("drone-dji:FlightPitchDegree"));
        String data = xmpProperties.get("drone-dji:SelfData");


        entity.setMissionId(data);
        entity.setGimbalYawDegree(gimbalYawDegree);
        entity.setGimbalRollDegree(gimbalRollDegree);
        entity.setGpsLatitudeRef(gpsDirectory.getString(GpsDirectory.TAG_LATITUDE_REF));
        entity.setFlightPitchDegree(flightPitchDegree);
        entity.setFlightRollDegree(flightRollDegree);
        entity.setFlightYawDegree(flightYawDegree);
        entity.setGpsLatitude(latitude);
        entity.setGimbalPitchDegree(gimbalPitchDegree);

        entity.setGpsLongitudeRef(gpsDirectory.getString(GpsDirectory.TAG_LONGITUDE_REF));
        entity.setGpsLongitude(longitude);
        entity.setGpsAltitudeRef(gpsDirectory.getString(GpsDirectory.TAG_ALTITUDE_REF));
        entity.setRelativelyAltitude(relativeAltitude);
        entity.setAbsolutelyAltitude(absoluteAltitude);


        //FILE--------------------------------------------------------------------
        FileSystemDirectory fileSystemDirectory = metadata.getFirstDirectoryOfType(FileSystemDirectory.class);
        entity.setFileName(fileSystemDirectory.getString(FileSystemDirectory.TAG_FILE_NAME));

        entity.setFileSize(fileSystemDirectory.getString(FileSystemDirectory.TAG_FILE_SIZE));

        entity.setModifyDate(fileSystemDirectory.getString(FileSystemDirectory.TAG_FILE_MODIFIED_DATE));


        System.out.println("entity = " + entity);

    }

}
