class StaticM{  
    static int count=1;
    StaticM()
    {  
        count++;
        System.out.println(count);  
    }

    static void count(){  
        count++;
    }  
    public static void main(String args[]){ 
        StaticM.count();
        StaticM counter=new StaticM(); 
    }  
}  