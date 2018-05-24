package com.mehrrizwan.lib.keyvaluestore.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "MAP".
 */
class Map {

    /** Not-null value. */
    private String key;
    private String value;

    public Map() {
    }

    public Map(String key) {
        this.key = key;
    }

    public Map(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /** Not-null value. */
    public String getKey() {
        return key;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
