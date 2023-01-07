package StaticInterfaceMethods;

public interface MyIF {
    int getUserID();

    default int getAdminID(){
        return 1;
    }

    static int getUniversalID(){
        return 0;
    }
    // calling getUniversalID can be done like so:
    // int UID = MyIF.getUniversalID();
}
