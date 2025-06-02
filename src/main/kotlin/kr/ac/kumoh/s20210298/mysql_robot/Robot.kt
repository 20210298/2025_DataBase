package kr.ac.kumoh.s20210298.mysql_robot

import jakarta.persistence.*

@Entity
@Table(name = "Mechanic")
data class Robot(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    var name: String,
    var model: String,
    var manufacturer: String,

    @Column(name = "class") // 데이터베이스에서 사용한 이름과 다를 때 선언
    var robotClass: String,
)

@Entity
data class Weapon(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    val type: String,
    val damage: Int,
    val ability: String,
)

@Entity
data class Equipment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    var mechanicId: Int,    // DB에선 snake_case로 썼지만, 여기전 상관없음
    var weaponId: Int,
    val location: String,
    val quantity: Int
)