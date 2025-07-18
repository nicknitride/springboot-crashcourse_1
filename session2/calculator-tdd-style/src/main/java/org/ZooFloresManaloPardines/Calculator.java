package org.ZooFloresManaloPardines;

public class Calculator {
    public int sum(int a, int b){
        return a+b;
    }
    public double sum(double a, double b){
        return a+b;
    }

    public float sum(float a, float b){
        return a+b;
    }

    public short sum(short a, short b){
        return (short) (a+b);
    }
    public long sum(long a, long b){
        return (a+b);
    }


    public double quotient(double a,double b){
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.err.println("Cannot divide by zero"+e.getMessage());
        }

        return 0;
    }

    public float quotient(float a,float b){
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.err.println("Cannot divide by zero"+e.getMessage());
        }
        return 0;
    }

    public int quotient(int a,int b){
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.err.println("Cannot divide by zero"+e.getMessage());
        }
        return 0;
    }

    public short quotient(short a,short b){
        try{
            return (short) (a/b);
        }catch (ArithmeticException e){
            System.err.println("Cannot divide by zero"+e.getMessage());
        }
        return 0;
    }

    public long quotient(long a,long b){
        try{
            return (a/b);
        }catch (ArithmeticException e){
            System.err.println("Cannot divide by zero"+e.getMessage());
        }
        return 0;
    }


    public int product(int a, int b){
        return a*b;
    }
    public float product(float a, float b){
        return a*b;
    }
    public double product(double a, double b){
        return a*b;
    }
    public int difference(int a, int b){
        return (a-b);
    }
    public double difference(double a, double b){
        return (a-b);
    }
    public float difference(float a, float b){
        return (a-b);
    }

}
