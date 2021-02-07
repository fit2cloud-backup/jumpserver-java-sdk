package jms;

import com.jumpserver.sdk.v2.common.ActionResponse;
import com.jumpserver.sdk.v2.model.*;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.List;

/**
 * 资产API调用相关测试用例
 */
public class JmsAssetsServiceTest extends CommonBeforeTest{

    private String assetId = "9a4aadd7-3aab-4a67-b191-52298ef6d2fb";

    @Test
    public void addAsset() {
        Asset asset = new Asset();
        asset.setId(assetId);
        asset.setIp("192.168.20.102");
        asset.setHostname("欧洲十国游");
        Asset assetnew = os.assets().create(asset);
        System.out.println(assetnew.getId());
    }

    @Test
    public void getAsset() {
        Asset asset = os.assets().get(assetId);
        System.out.println(asset.getHostname());
        System.out.println(asset.getAdmin_user());
    }

    @Test
    public void assets() {
        List<Asset> assetList = os.assets().list();
        System.out.println("assets size: " + assetList.size());
        for (Asset asset : assetList) {
            System.out.println(asset.getId());
            System.out.println(asset.getIp());
            System.out.println(asset.getHostname());
            System.out.println(StringUtils.join(asset.getNodes()));
        }
    }

    @Test
    public void updateAsset() {
        Asset asset = new Asset();
        asset.setId(assetId);
        asset.setIp("192.168.20.102");
        asset.setHostname("欧洲十一国游");
        Asset assetnew = os.assets().update(asset);
        System.out.println(assetnew.getId());
    }

    @Test
    public void deleteAsset() {
        ActionResponse delete = os.assets().delete(assetId);
        System.out.println(delete);
    }

    //=========================== 资产树 =============================
    @Test
    public void addAssetsNode() {
        AssetsNode object = new AssetsNode();
        object.setId(assetId);
        object.setValue("演示工作空间-son");
        AssetsNode objectBack = os.assets().createAssetsNode(object);
        System.out.println(objectBack.getId());
    }

    @Test
    public void getAssetsNode() {
        AssetsNode object = os.assets().getAssetsNode(assetId);
        System.out.println(object.getValue());
    }

    @Test
    public void updateAssetsNode() {
        AssetsNode object = new AssetsNode();
        object.setId(assetId);
        object.setValue("docker_tmp");
        AssetsNode objectBack = os.assets().updateAssetsNode(object);
        System.out.println(objectBack.getId());
    }

    @Test
    public void AssetsNodes() {
        List<AssetsNode> list = os.assets().listAssetsNode();
        System.out.println(list.size());
        for (AssetsNode object : list) {
            System.out.println(object.getId()+"---"+object.getValue()+"---"+object.getParent_id());
        }
    }

    @Test
    public void deleteAssetsNode() {
        ActionResponse delete = os.assets().deleteAssetsNode(assetId);
        System.out.println(delete);
    }

    @Test
    public void deleteAssetsNodeWithAssetCheckCircle() {
     String nodeId="098096a1-988e-4083-a3ae-73a73d9045e4";
     ActionResponse delete = os.assets().deleteAssetsNodeWithAssetCheckCircle(nodeId);
        System.out.println(delete);
    }


    @Test
    public void deleteAssetsNodeWithAssetCheck() {
        String nodeId="098096a1-988e-4083-a3ae-73a73d9045e4";
        ActionResponse delete = os.assets().deleteAssetsNodeWithAssetCheck(nodeId);
        System.out.println(delete);
    }

    @Test
    public void AssetsNodesIdChildren() {
        String nodeId="098096a1-988e-4083-a3ae-73a73d9045e4";
        List<AssetsNode> list = os.assets().listAssetsNodeIdChildren(nodeId);
        System.out.println(list.size());
        for (AssetsNode object : list) {
            System.out.println(object.getId()+"---"+object.getValue()+"---"+object.getParent_id());
        }
    }

    @Test
    public void createAssetsNodeChildren() {
        String nodeId="7683c06a-a8e7-4f1e-b87c-09e0f7d402e8";
        AssetsNode object = new AssetsNode();
        object.setId("8683c06a-a8e7-4f1e-b87c-09e0f7d402e8");
        object.setValue("演示工作空间-son");
        AssetsNode result = os.assets().createAssetsNodeChildren(nodeId,object);
        System.out.println(result.getId()+"---"+result.getValue()+"---"+result.getParent_id());
    }
}
