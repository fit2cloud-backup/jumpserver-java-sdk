package jms;

import com.jumpserver.sdk.v2.common.ActionResponse;
import com.jumpserver.sdk.v2.model.Domain;
import com.jumpserver.sdk.v2.model.Gateway;
import org.junit.Test;

import java.util.List;

/**
 * 网域网关相关测试用例
 */
public class JmsDomainServiceTest extends CommonBeforeTest{

    private String domainId = "19fe7639-755f-488d-80a1-871b3917276f";
    private String gatewayId = "c4d09353-12b7-4945-9e67-a1a33b0a1838";

    @Test
    public void addDomain() {
        Domain object = new Domain();
        object.setName("API_create_domain");
        object.setAssets(new String[]{"f1201edb-14f6-4eae-851a-cb04283e0487"});
        object.setId(domainId);
        Domain objectBack = os.domains().createDomain(object);
        System.out.println(objectBack.getId());
    }

    @Test
    public void getDomain() {
        Domain objectBack = os.domains().getDomain(domainId);
        System.out.println(objectBack.getId());
    }

    @Test
    public void updateDomain() {
        Domain object = new Domain();
        object.setName("API_update_domain");
        object.setAssets(new String[]{"f1201edb-14f6-4eae-851a-cb04283e0487"});
        object.setId(domainId);
        Domain objectBack = os.domains().updateDomain(object);
        System.out.println(objectBack.getId());
    }

    @Test
    public void listDomains() {
        List<Domain> domainList = os.domains().listDomains();
        System.out.println("共 " + domainList.size() + " 个 Domain");
    }

    @Test
    public void addGateway() {
        Gateway object = new Gateway();
        object.setName("API_create_gateway");
        object.setIp("10.1.10.1");
        object.setPort(22);
        object.setProtocol("ssh");
        object.setDomain(domainId);
        object.setId(gatewayId);
        Gateway objectBack = os.domains().createGateway(object);
        System.out.println(objectBack.getId());
    }

    @Test
    public void getGateway() {
        Gateway objectBack = os.domains().getGateway(gatewayId);
        System.out.println(objectBack.getId());
    }

    @Test
    public void updateGateway() {
        Gateway object = new Gateway();
        object.setName("API_update_gateway");
        object.setIp("10.1.10.2");
        object.setPort(3389);
        object.setProtocol("rdp");
        object.setDomain(domainId);
        object.setId(gatewayId);
        Gateway objectBack = os.domains().updateGateway(object);
        System.out.println(objectBack.getId());
    }

    @Test
    public void listGateways() {
        List<Gateway> gatewayList = os.domains().listGateways();
        System.out.println("共 " + gatewayList.size() + " 个 Gateway");
    }

    @Test
    public void deleteGateway() {
        ActionResponse response = os.domains().deleteGateway(gatewayId);
        System.out.println(response.getCode());
    }

    @Test
    public void deleteDomain() {
        ActionResponse response = os.domains().deleteDomain(domainId);
        System.out.println(response.getCode());
    }


}
