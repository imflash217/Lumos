// Overloading Constructors

class Box{
    
    double width;
    double height;
    double depth;
    
    // Overloading the Box Constructor
    
    // This is the constructor of the 'Box' class with three args.
    Box(double w, double h, double l){
        width = w;
        height = h;
        depth = l;
    }
    
    // Another constructor of 'Box' with no args
    Box(){
        width = -1;
        height = -2;
        depth = -3;
    }
    
    // Another constructor of 'Box' to create a cube
    
    Box(double side){
        width = side;
        height = side;
        depth = side;
    }
    
    
    // compute and return volume
    
    double volume(){
        double volume = width*height*depth;
        return volume;
    }
    
}   // end Box


class main_03{
    public static void main(String args[]){
        // Create boxes using various constructors
        
        Box box1 = new Box(10,1.2,5.9);
        Box box2 = new Box();
        Box box3 = new Box(15);
        double vol;
        
        System.out.println("box1_volume : " + box1.volume());
        System.out.println("box2_volume : " + box2.volume());
        System.out.println("box3_volume : " + box3.volume());
        
    }
}