// Returning Objects

class Test{
    int a;
    
    Test(int i){
        a = i;
    }
    
    Test incrByTen(){
        Test temp = new Test(a+10);
        
        return temp;
    }
}

class main_07{
    public static void main(String args[]){
        Test obj1 = new Test(2);
        Test obj2 = obj1.incrByTen();
        
        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
        System.out.println("(obj2.incrByTen()).a = " + (obj2.incrByTen()).a);
        
    }
}