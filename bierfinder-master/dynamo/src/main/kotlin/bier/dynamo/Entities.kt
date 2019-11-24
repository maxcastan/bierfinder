package bier.dynamo

import java.net.Inet4Address
import java.time.LocalDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Users(
        @Id val id: UUID = UUID.randomUUID(),
        val userCategory: String
)

@Entity
class Manufacturer(
        @Id val id: UUID = UUID.randomUUID(),
        var name: String,
        var email: String,
        var address: String
)

@Entity
class Establishment(
        @Id val id: UUID = UUID.randomUUID(),
        var name: String,
        var email: String,
        var address: String,
        var numFavs: Int,
        var favBy: String
)

@Entity
class RegUsers(
        @Id val id: UUID = UUID.randomUUID(),
        var email: String,
        var address: String,
        var dob: LocalDate,
        var gender: String
)

@Entity
class Beers(
        @Id val id: UUID = UUID.randomUUID(),
        var name: String,
        var style: String,
        var abv: Float,
        var numFavs: Int,
        var favBy: String
)