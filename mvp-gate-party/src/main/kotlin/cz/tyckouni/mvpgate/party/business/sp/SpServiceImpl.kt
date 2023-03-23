package cz.tyckouni.mvpgate.party.business.sp

import cz.tyckouni.mvpgate.party.business.ServiceBase
import cz.tyckouni.mvpgate.party.persistence.sp.Sp
import cz.tyckouni.mvpgate.party.persistence.sp.SpRepository
import org.springframework.stereotype.Service

@Service
class SpServiceImpl(
    spRepository: SpRepository,
) : ServiceBase<Sp>(spRepository), SpService
