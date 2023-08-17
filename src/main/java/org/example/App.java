package org.example;

import org.example.model.*;
import org.example.data.VendingMachine;
import org.example.data.IVendingMachine;
import  org.example.model.Chocolatebar;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        Product[] products = {
                new Chocolatebar(1, 10, "WhiteChocolate", ChocolatebarType.WITH_ALMONDS),
                new Chocolatebar(2,10, "MilkChocolate", ChocolatebarType.WITHOUT_ALMONDS),
                new Gummybear(3, 5, "Pinkgummybear", GummybearType.WITH_SUGARCOAT),
                new Cottoncandy(4, 10, "YellowCotton", CottoncandyType.WITH_SPRINKLE),
                new Chocolatebar(5, 20, "DarkChocolate",ChocolatebarType.WITH_MARSHMALLOW),

        };
        IVendingMachine vendingMachine = new VendingMachine(products);


        vendingMachine.addCurrency(100);
        Product MilkChocolate = vendingMachine.request(1);
        Product DarkChocolate = vendingMachine.request(5);
        System.out.println(MilkChocolate.use());
        System.out.println(DarkChocolate.use());
        System.out.println(vendingMachine.getBalance());


    }
    }

