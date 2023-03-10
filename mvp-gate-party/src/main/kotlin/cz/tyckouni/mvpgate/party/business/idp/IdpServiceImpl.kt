package cz.tyckouni.mvpgate.party.business.idp

import cz.tyckouni.mvpgate.party.business.ServiceBase
import cz.tyckouni.mvpgate.party.persistence.idp.Idp
import cz.tyckouni.mvpgate.party.persistence.idp.IdpRepository
import org.springframework.stereotype.Service

@Service
class IdpServiceImpl(
    idpRepository: IdpRepository,
) : ServiceBase<Idp>(idpRepository), IdpService
