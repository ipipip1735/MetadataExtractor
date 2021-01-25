/**
 * Created by Administrator on 2021/1/25 14:45.
 */
public class ImgMeta {

    //@Id
    //@GenericGenerator(name = "system-uuid", strategy = "uuid")
    //@GeneratedValue(generator = "system-uuid")
    private String id;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '文件名'")
    private String fileName;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '文件大小'")
    private String fileSize;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '文件缓和时间'")
    private String fileModifiedDate;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '缓和时间'")
    private String modifyDate;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '图片id'")
    private String imgEntity;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '文件名'")
    private String make;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '对应的任务id'")
    private String missionId;
    private String model;

    //@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String time;

    //@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String dateTimeOriginal;

    //@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String dateTimeDigitized;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '图像宽度'")
    private String imgWidth;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '图像高度'")
    private String imgHeight;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '焦距'")
    private String focalLength;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment 'gps版本号'")
    private String gpsVersionId;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment 'gps纬度尺寸'")
    private String gpsLatitudeRef;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment 'gps纬度'")
    private double gpsLatitude;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment 'gps经度尺寸'")
    private String gpsLongitudeRef;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '经度'")
    private double gpsLongitude;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment 'gps高度尺寸'")
    private String gpsAltitudeRef;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '绝对高度'")
    private Float absolutelyAltitude;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '相对高度'")
    private Float relativelyAltitude;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '校准焦距'")
    private Float calibratedFocalLength;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '校准x轴光心'")
    private Float calibratedOpticalCenterX;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '校准y轴光心'")
    private Float calibratedOpticalCenterY;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '焦距'")
    private Float gimbalRollDegree;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '最高点'")
    private Float gimbalPitchDegree;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment 'gim偏航角度'")
    private Float gimbalYawDegree;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '焦距'")
    private String format;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '凸轮反求'")
    private String camReverse;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '航线翻转角度'")
    private Float flightRollDegree;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '航线最高角度'")
    private Float flightPitchDegree;
    //@Column(nullable =true ,columnDefinition = "varchar(200) comment '航线偏航角度'")
    private Float flightYawDegree;


    public void setId(String id) {
        this.id = id;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public void setFileModifiedDate(String fileModifiedDate) {
        this.fileModifiedDate = fileModifiedDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void setImgEntity(String imgEntity) {
        this.imgEntity = imgEntity;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDateTimeOriginal(String dateTimeOriginal) {
        this.dateTimeOriginal = dateTimeOriginal;
    }

    public void setDateTimeDigitized(String dateTimeDigitized) {
        this.dateTimeDigitized = dateTimeDigitized;
    }

    public void setImgWidth(String imgWidth) {
        this.imgWidth = imgWidth;
    }

    public void setImgHeight(String imgHeight) {
        this.imgHeight = imgHeight;
    }

    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

    public void setGpsVersionId(String gpsVersionId) {
        this.gpsVersionId = gpsVersionId;
    }

    public void setGpsLatitudeRef(String gpsLatitudeRef) {
        this.gpsLatitudeRef = gpsLatitudeRef;
    }

    public void setGpsLatitude(double gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public void setGpsLongitudeRef(String gpsLongitudeRef) {
        this.gpsLongitudeRef = gpsLongitudeRef;
    }

    public void setGpsLongitude(double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public void setGpsAltitudeRef(String gpsAltitudeRef) {
        this.gpsAltitudeRef = gpsAltitudeRef;
    }

    public void setAbsolutelyAltitude(Float absolutelyAltitude) {
        this.absolutelyAltitude = absolutelyAltitude;
    }

    public void setRelativelyAltitude(Float relativelyAltitude) {
        this.relativelyAltitude = relativelyAltitude;
    }

    public void setCalibratedFocalLength(Float calibratedFocalLength) {
        this.calibratedFocalLength = calibratedFocalLength;
    }

    public void setCalibratedOpticalCenterX(Float calibratedOpticalCenterX) {
        this.calibratedOpticalCenterX = calibratedOpticalCenterX;
    }

    public void setCalibratedOpticalCenterY(Float calibratedOpticalCenterY) {
        this.calibratedOpticalCenterY = calibratedOpticalCenterY;
    }

    public void setGimbalRollDegree(Float gimbalRollDegree) {
        this.gimbalRollDegree = gimbalRollDegree;
    }

    public void setGimbalPitchDegree(Float gimbalPitchDegree) {
        this.gimbalPitchDegree = gimbalPitchDegree;
    }

    public void setGimbalYawDegree(Float gimbalYawDegree) {
        this.gimbalYawDegree = gimbalYawDegree;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setCamReverse(String camReverse) {
        this.camReverse = camReverse;
    }

    public void setFlightRollDegree(Float flightRollDegree) {
        this.flightRollDegree = flightRollDegree;
    }

    public void setFlightPitchDegree(Float flightPitchDegree) {
        this.flightPitchDegree = flightPitchDegree;
    }

    public void setFlightYawDegree(Float flightYawDegree) {
        this.flightYawDegree = flightYawDegree;
    }


    public String getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public String getFileModifiedDate() {
        return fileModifiedDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public String getImgEntity() {
        return imgEntity;
    }

    public String getMake() {
        return make;
    }

    public String getMissionId() {
        return missionId;
    }

    public String getModel() {
        return model;
    }

    public String getTime() {
        return time;
    }

    public String getDateTimeOriginal() {
        return dateTimeOriginal;
    }

    public String getDateTimeDigitized() {
        return dateTimeDigitized;
    }

    public String getImgWidth() {
        return imgWidth;
    }

    public String getImgHeight() {
        return imgHeight;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public String getGpsVersionId() {
        return gpsVersionId;
    }

    public String getGpsLatitudeRef() {
        return gpsLatitudeRef;
    }

    public double getGpsLatitude() {
        return gpsLatitude;
    }

    public String getGpsLongitudeRef() {
        return gpsLongitudeRef;
    }

    public double getGpsLongitude() {
        return gpsLongitude;
    }

    public String getGpsAltitudeRef() {
        return gpsAltitudeRef;
    }

    public Float getAbsolutelyAltitude() {
        return absolutelyAltitude;
    }

    public Float getRelativelyAltitude() {
        return relativelyAltitude;
    }

    public Float getCalibratedFocalLength() {
        return calibratedFocalLength;
    }

    public Float getCalibratedOpticalCenterX() {
        return calibratedOpticalCenterX;
    }

    public Float getCalibratedOpticalCenterY() {
        return calibratedOpticalCenterY;
    }

    public Float getGimbalRollDegree() {
        return gimbalRollDegree;
    }

    public Float getGimbalPitchDegree() {
        return gimbalPitchDegree;
    }

    public Float getGimbalYawDegree() {
        return gimbalYawDegree;
    }

    public String getFormat() {
        return format;
    }

    public String getCamReverse() {
        return camReverse;
    }

    public Float getFlightRollDegree() {
        return flightRollDegree;
    }

    public Float getFlightPitchDegree() {
        return flightPitchDegree;
    }

    public Float getFlightYawDegree() {
        return flightYawDegree;
    }


    @Override
    public String toString() {
        return "ImgMeta{" +
                "id='" + id + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", fileModifiedDate='" + fileModifiedDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                ", imgEntity='" + imgEntity + '\'' +
                ", make='" + make + '\'' +
                ", missionId='" + missionId + '\'' +
                ", model='" + model + '\'' +
                ", time='" + time + '\'' +
                ", dateTimeOriginal='" + dateTimeOriginal + '\'' +
                ", dateTimeDigitized='" + dateTimeDigitized + '\'' +
                ", imgWidth='" + imgWidth + '\'' +
                ", imgHeight='" + imgHeight + '\'' +
                ", focalLength='" + focalLength + '\'' +
                ", gpsVersionId='" + gpsVersionId + '\'' +
                ", gpsLatitudeRef='" + gpsLatitudeRef + '\'' +
                ", gpsLatitude=" + gpsLatitude +
                ", gpsLongitudeRef='" + gpsLongitudeRef + '\'' +
                ", gpsLongitude=" + gpsLongitude +
                ", gpsAltitudeRef='" + gpsAltitudeRef + '\'' +
                ", absolutelyAltitude=" + absolutelyAltitude +
                ", relativelyAltitude=" + relativelyAltitude +
                ", calibratedFocalLength=" + calibratedFocalLength +
                ", calibratedOpticalCenterX=" + calibratedOpticalCenterX +
                ", calibratedOpticalCenterY=" + calibratedOpticalCenterY +
                ", gimbalRollDegree=" + gimbalRollDegree +
                ", gimbalPitchDegree=" + gimbalPitchDegree +
                ", gimbalYawDegree=" + gimbalYawDegree +
                ", format='" + format + '\'' +
                ", camReverse='" + camReverse + '\'' +
                ", flightRollDegree=" + flightRollDegree +
                ", flightPitchDegree=" + flightPitchDegree +
                ", flightYawDegree=" + flightYawDegree +
                '}';
    }
}
