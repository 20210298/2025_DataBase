package kr.ac.kumoh.s20210298.mysql_robot

import org.springframework.stereotype.Service

@Service
class RobotService(val repository: RobotRepository) {
    fun getAllRobots() = repository.findAll()   // 이미 findAll()이 JpaRepository에 구현되어 있음

    fun getRobotWithWeapons(): List<EquipmentDto> {
        return repository.findAllEquipment()
    }
}