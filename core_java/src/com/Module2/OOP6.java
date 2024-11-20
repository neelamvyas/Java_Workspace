package com.Module2.copy;

class Complex 
{
    int real, imaginary;

    Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex c)
    {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    Complex subtract(Complex c)
    {
        return new Complex(this.real - c.real, this.imaginary - c.imaginary);
    }

    Complex multiply(Complex c)
    {
        return new Complex(this.real * c.real - this.imaginary * c.imaginary,
                           this.real * c.imaginary + this.imaginary * c.real);
    }

    void display() 
    {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class OOP6 {
    public static void main(String[] args)
    {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);
        
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);
        
        System.out.print("Sum: ");
        sum.display();
      
        System.out.print("Difference: ");
        difference.display();
        
        System.out.print("Product: ");
        product.display();
    }
}
