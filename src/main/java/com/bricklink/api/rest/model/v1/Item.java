package com.bricklink.api.rest.model.v1;

public class Item {
    private String no; // Item's identification number in BrickLink catalog
    private String name; // The name of the item
    private String type; // The type of the item	MINIFIG, PART, SET, BOOK, GEAR, CATALOG, INSTRUCTION, UNSORTED_LOT, ORIGINAL_BOX
    private Integer category_id; // The main category of the item
    private String alternate_no; // Alternate item number	Alternate item number
    private String image_url; // Image link for this item
    private String thumbnail_url; // Image thumbnail link for this item
    private Double weight; // Point Number	The weight of the item in grams	with 2 decimal places
    private String dim_x; // Length of the item	Item dimensions with 2 decimal places
    private String dim_y; // Width of the item	Item dimensions with 2 decimal places
    private String dim_z; // Height of the item	Item dimensions with 2 decimal places
    private Integer year_released; // Item year of release
    private String description; // Short description for this item
    private Boolean is_obsolete; // Indicates whether the item is obsolete
    private String language_code; // Item language code	Item language

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getAlternate_no() {
        return alternate_no;
    }

    public void setAlternate_no(String alternate_no) {
        this.alternate_no = alternate_no;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDim_x() {
        return dim_x;
    }

    public void setDim_x(String dim_x) {
        this.dim_x = dim_x;
    }

    public String getDim_y() {
        return dim_y;
    }

    public void setDim_y(String dim_y) {
        this.dim_y = dim_y;
    }

    public String getDim_z() {
        return dim_z;
    }

    public void setDim_z(String dim_z) {
        this.dim_z = dim_z;
    }

    public Integer getYear_released() {
        return year_released;
    }

    public void setYear_released(Integer year_released) {
        this.year_released = year_released;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getObsolete() {
        return is_obsolete;
    }

    public void setObsolete(Boolean obsolete) {
        is_obsolete = obsolete;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    @Override
    public String toString() {
        return "Item{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", category_id=" + category_id +
                ", alternate_no='" + alternate_no + '\'' +
                ", image_url='" + image_url + '\'' +
                ", thumbnail_url='" + thumbnail_url + '\'' +
                ", weight=" + weight +
                ", dim_x='" + dim_x + '\'' +
                ", dim_y='" + dim_y + '\'' +
                ", dim_z='" + dim_z + '\'' +
                ", year_released=" + year_released +
                ", description='" + description + '\'' +
                ", is_obsolete=" + is_obsolete +
                ", language_code='" + language_code + '\'' +
                '}';
    }
}
