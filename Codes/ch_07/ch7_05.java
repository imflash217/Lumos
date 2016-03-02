
class Box{
    
    double width, height, depth;
    
    //  Constructor #1
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    // Constructor #2
    Box(Box boxObject){
        width = boxObject.width;
        height = boxObject.height;
        depth = boxObject.depth;
    }
    
    double volume(){
        return width*height*depth;
    }
}

class main_05{
    public static void main(String args[]){
        Box box1 = new Box(10, 15.8, 89.999);
        Box box1_clone = new Box(box1);
        
        System.out.println("volume of box1 : " + box1.volume());
        System.out.println("volume of box1_clone : " + box1_clone.volume());
        
    }
}