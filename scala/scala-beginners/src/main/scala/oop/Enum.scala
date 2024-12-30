package oop

object Enum extends App{

     enum Permissions {
       case READ, WRITE, EXECUTE, NONE
       //add fields/methods
       def openDocument():Unit=
         if(this==READ) println("opening document")
         else println("reading not allowed")
     }
     val somePermission = Permissions.READ
     somePermission.openDocument()

     enum PermissionsWithBits(val bits: Int)
     {
        case READ extends PermissionsWithBits(4)
        case WRITE extends PermissionsWithBits(2)
        case EXECUTE extends PermissionsWithBits(1)
        case NONE extends PermissionsWithBits(0)
     }
     val permissionBits = PermissionsWithBits.READ.bits
     val index= somePermission.ordinal
     println(permissionBits)
     println(index)
     val allPermissions= PermissionsWithBits.values //array of all possible values of the enum
     println(allPermissions.mkString(","))

     val readPermission= Permissions.valueOf("READ")
     println(readPermission)

}
