//import java.util.*
//
//fun main() {
//
//
//
//
//        val clients = (1..10).map {
//
//            Client(
//
//                firstName = "ClientName$it",
//
//                lastName = "ClientSurname$it",
//
//                number = "ClientPhoneNumber$it",
//
//                email = "ClientEmail$it",
//
//                bill = Bill(Random.nextDouble(200_000.0))
//
//            )
//
//        }
//
//        val hotels = (1..3).map {
//
//            Hotel(
//
//                nameHotel = "HotelName$it",
//
//                listRoom = (1..50).map {
//
//                    Room(
//
//                        capasity = Random.nextInt(5),
//
//                        price = Random.nextDouble(20_000.0),
//
//                        isBusy = true
//
//                    )
//
//                }
//
//            )
//
//        }
//
//        clients.random().ordering(hotels.random().listRoom.random())
//
//    }
//
//
//class Client(val firstName: String,val lastName: String,val email: String,val number: String,val bill: Bill){
//
//    fun ordering(room: Room){
//        if (!room.isBusy && bill.cash >= room.price){
//            !room.isBusy
//            bill.cash=bill.cash-room.price
//        }
//    }
//
//}
//
//class Bill(var cash: Double )
//class Hotel(val nameHotel: String,val listRoom: List<Room>)
//class Room(val capasity: Int, val price: Double, val isBusy: Boolean)