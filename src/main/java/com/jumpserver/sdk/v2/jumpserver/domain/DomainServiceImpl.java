package com.jumpserver.sdk.v2.jumpserver.domain;

import com.alibaba.fastjson.JSON;
import com.jumpserver.sdk.v2.common.ActionResponse;
import com.jumpserver.sdk.v2.common.BaseJmsService;
import com.jumpserver.sdk.v2.common.ClientConstants;
import com.jumpserver.sdk.v2.model.Domain;
import com.jumpserver.sdk.v2.model.Gateway;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class DomainServiceImpl extends BaseJmsService implements DomainService{

    public List<Domain> listDomains(){
        return get(Domain.class, uri(ClientConstants.DOMAINS)).executeList();
    }

    public Domain getDomain(String domainId){
        checkNotNull(domainId);
        return get(Domain.class, ClientConstants.DOMAINS, domainId, "/").execute();
    }

    public Domain updateDomain(Domain domain){
        checkNotNull(domain);
        return patch(Domain.class, ClientConstants.DOMAINS, domain.getId(), "/").json(JSON.toJSONString(domain)).execute();
    }

    public Domain createDomain(Domain domain){
        checkNotNull(domain);
        return post(Domain.class, uri(ClientConstants.DOMAINS))
                .json(JSON.toJSONString(domain))
                .execute();
    }

    public ActionResponse deleteDomain(String domainId){
        checkNotNull(domainId);
        return deleteWithResponse(ClientConstants.DOMAINS, domainId, "/").execute();
    }

    public List<Gateway> listGateways(){
        return get(Gateway.class, uri(ClientConstants.DOMAINS)).executeList();
    }

    public Gateway getGateway(String gatewayId){
        checkNotNull(gatewayId);
        return get(Gateway.class, ClientConstants.GATEWAYS, gatewayId, "/").execute();
    }

    public Gateway updateGateway(Gateway gateway){
        checkNotNull(gateway);
        return patch(Gateway.class, ClientConstants.GATEWAYS, gateway.getId(), "/").json(JSON.toJSONString(gateway)).execute();
    }

    public Gateway createGateway(Gateway gateway){
        checkNotNull(gateway);
        return post(Gateway.class, uri(ClientConstants.GATEWAYS))
                .json(JSON.toJSONString(gateway))
                .execute();
    }

    public ActionResponse deleteGateway(String gatewayId){
        checkNotNull(gatewayId);
        return deleteWithResponse(ClientConstants.GATEWAYS, gatewayId, "/").execute();
    }
}
