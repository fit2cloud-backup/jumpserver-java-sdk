package com.jumpserver.sdk.v2.model;

import java.util.List;

public class AssetsDomain {

    private String id;
    private String name;
    private String comment;
    private String date_created;
    private String asset_count;
    private List<String> assets;
    private String application_count;
    private String gateway_count;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getAsset_count() {
        return asset_count;
    }

    public void setAsset_count(String asset_count) {
        this.asset_count = asset_count;
    }

    public List<String> getAssets() {
        return assets;
    }

    public void setAssets(List<String> assets) {
        this.assets = assets;
    }

    public String getApplication_count() {
        return application_count;
    }

    public void setApplication_count(String application_count) {
        this.application_count = application_count;
    }

    public String getGateway_count() {
        return gateway_count;
    }

    public void setGateway_count(String gateway_count) {
        this.gateway_count = gateway_count;
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
