package net.dongliu.apk.parser.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongliu
 */
public class ApkMeta {

    private String packageName;
    private String label;
    private Icon icon;
    private String versionName;
    private Long versionCode;
    private Constants.InstallLocation installLocation;
    private String minSdkVersion;
    private String targetSdkVersion;
    private String maxSdkVersion;
    private GlEsVersion glEsVersion;
    private boolean anyDensity;
    private boolean smallScreens;
    private boolean normalScreens;
    private boolean largeScreens;

    private List<String> usesPermissions = new ArrayList<String>();
    private List<UseFeature> usesFeatures = new ArrayList<UseFeature>();
    private List<Permission> permissions = new ArrayList<Permission>();
    private List<Service> services = new ArrayList<Service>();
    private List<Activity> activities = new ArrayList<Activity>();
    private List<Receiver> receivers = new ArrayList<Receiver>();

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Long getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Long versionCode) {
        this.versionCode = versionCode;
    }

    public String getMinSdkVersion() {
        return minSdkVersion;
    }

    public void setMinSdkVersion(String minSdkVersion) {
        this.minSdkVersion = minSdkVersion;
    }

    public String getTargetSdkVersion() {
        return targetSdkVersion;
    }

    public void setTargetSdkVersion(String targetSdkVersion) {
        this.targetSdkVersion = targetSdkVersion;
    }

    public String getMaxSdkVersion() {
        return maxSdkVersion;
    }

    public void setMaxSdkVersion(String maxSdkVersion) {
        this.maxSdkVersion = maxSdkVersion;
    }

    public List<String> getUsesPermissions() {
        return usesPermissions;
    }

    public void addUsesPermission(String permission) {
        this.usesPermissions.add(permission);
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isAnyDensity() {
        return anyDensity;
    }

    public void setAnyDensity(boolean anyDensity) {
        this.anyDensity = anyDensity;
    }

    public boolean isSmallScreens() {
        return smallScreens;
    }

    public void setSmallScreens(boolean smallScreens) {
        this.smallScreens = smallScreens;
    }

    public boolean isNormalScreens() {
        return normalScreens;
    }

    public void setNormalScreens(boolean normalScreens) {
        this.normalScreens = normalScreens;
    }

    public boolean isLargeScreens() {
        return largeScreens;
    }

    public void setLargeScreens(boolean largeScreens) {
        this.largeScreens = largeScreens;
    }

    public GlEsVersion getGlEsVersion() {
        return glEsVersion;
    }

    public void setGlEsVersion(GlEsVersion glEsVersion) {
        this.glEsVersion = glEsVersion;
    }

    public List<UseFeature> getUsesFeatures() {
        return usesFeatures;
    }

    public void addUseFeatures(UseFeature useFeature) {
        this.usesFeatures.add(useFeature);
    }

    public Constants.InstallLocation getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(Constants.InstallLocation installLocation) {
        this.installLocation = installLocation;
    }

    public void addPermission(Permission permission) {
        this.permissions.add(permission);
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public List<Service> getServices() {
        return services;
    }

    public void addService(Service service) {
        this.services.add(service);
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public List<Receiver> getReceivers() {
        return receivers;
    }

    public void addReceiver(Receiver receiver) {
        this.receivers.add(receiver);
    }

    @Override
    public String toString() {
        return "packageName: \t" + packageName + "\n"
                + "label: \t" + label + "\n"
                + "versionName: \t" + versionName + "\n"
                + "versionCode: \t" + versionCode + "\n"
                + "minSdkVersion: \t" + minSdkVersion + "\n"
                + "targetSdkVersion: \t" + targetSdkVersion + "\n"
                + "maxSdkVersion: \t" + maxSdkVersion;
    }

}
