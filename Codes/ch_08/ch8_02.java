// Using 'super' to call super-class constructor

class Box{
    double width, height, depth;
    
    // Box(double w, double h, double d){
    //     width = w;
    //     height = h;
    //     depth = d;
    // }
    
    double volume (){
        return width*height*depth;
    }
}

// Extending Box to include weight

class WeightBox extends Box{
    double weight;
    
    WeightBox(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class main_802{
    public static void main(String args[]){
        WeightBox obj1 = new WeightBox(12.5, 25.6, 8.9, 56.4);
        System.out.println("Volume: WeightBox.volume = " + obj1.volume());
        System.out.println("Volume: WeightBox.weight = " + obj1.weight);
    }
}