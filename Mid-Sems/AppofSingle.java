 class Room{
    public int length,breadth,height;
    Room(int x,int y){
        length = x;
        breadth = y;
    }
    int area()
    {
        return (length*breadth);
    }
}

 class Bedroom extends Room{
    Bedroom(int x, int y, int z)
    {
        super(x,y);
        height = z;
    }
    int volume()
    {
        return (length*breadth*height);
    }
}



public class AppofSingle {
    public static void main(String[] args) {
        Bedroom room = new Bedroom(10,20,30);
        int area1 =  room.area();
        int vol1 = room.volume();
        System.out.println("Area: "+ area1);
        System.out.println("Volume: " + vol1);
    }
}