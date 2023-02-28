package cz.tyckouni.passgate.store.business.idp

import cz.tyckouni.passgate.store.business.ServiceBase
import cz.tyckouni.passgate.store.persistence.idp.Idp
import cz.tyckouni.passgate.store.persistence.idp.IdpRepository
import org.springframework.stereotype.Service

@Service
class IdpServiceImpl(
    idpRepository: IdpRepository,
) : ServiceBase<Idp>(idpRepository), IdpService
