package com.jumpserver.sdk.v2.model;

public class Domain {
    private String id;

    private String name;

    private String asset_count;

    private String gateway_count;

    private String comment;

    private String[] assets;

    private String date_created;

    private String org_id;

    private String org_name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsset_count() {
        return asset_count;
    }

    public void setAsset_count(String asset_count) {
        this.asset_count = asset_count;
    }

    public String getGateway_count() {
        return gateway_count;
    }

    public void setGateway_count(String gateway_count) {
        this.gateway_count = gateway_count;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String[] getAssets() {
        return assets;
    }

    public void setAssets(String[] assets) {
        this.assets = assets;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }
}
