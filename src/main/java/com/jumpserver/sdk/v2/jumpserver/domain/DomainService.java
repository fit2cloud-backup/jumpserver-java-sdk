package com.jumpserver.sdk.v2.jumpserver.domain;

import com.jumpserver.sdk.v2.common.ActionResponse;
import com.jumpserver.sdk.v2.model.Domain;
import com.jumpserver.sdk.v2.model.Gateway;

import java.util.List;

/**
 * @author luyang
 */
public interface DomainService {

    List<Domain> listDomains();

    Domain getDomain(String domainId);

    Domain updateDomain(Domain domain);

    Domain createDomain(Domain domain);

    ActionResponse deleteDomain(String domainId);

    List<Gateway> listGateways();

    Gateway getGateway(String gatewayId);

    Gateway updateGateway(Gateway gateway);

    Gateway createGateway(Gateway gateway);

    ActionResponse deleteGateway(String gatewayId);

}
