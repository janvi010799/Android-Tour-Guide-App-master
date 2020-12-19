package com.example.android.nieporettourguide;

/**
 * {@link Location} contains resource IDs for the name, description, address, website and image for the location.
 */
public class Location {

    // String resource ID for the name of the location.
    private int nameId;

    // String resource ID for the description of the location.
    private int descId;

    // String resource ID for the address of the location.
    private int addressId;

    // String resource ID for the website of the location.
    private int websiteId;

    // Image resource ID for the location.
    private int imageId;

    // Constructor - creating a new Location object.
    public Location(int nameId, int descId, int addressId, int websiteId, int imageId) {
        this.nameId = nameId;
        this.descId = descId;
        this.addressId = addressId;
        this.websiteId = websiteId;
        this.imageId = imageId;
    }

    // Getter - string resource ID for the name of the location.
    public int getNameId() {
        return nameId;
    }

    // Getter - string resource ID for the description of the location.
    public int getDescId() {
        return descId;
    }

    // Getter - string resource ID for address of the location.
    public int getAddressId() {
        return addressId;
    }

    // Getter - string resource ID for website of the location.
    public int getWebsiteId() {
        return websiteId;
    }

    // Getter - image resource ID for the location.
    public int getImageId() {
        return imageId;
    }
}
