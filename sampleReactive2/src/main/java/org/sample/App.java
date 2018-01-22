package org.sample;

import io.reactivex.Observable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Observable.fromArray(1,2,3,4,5)
        			.map(x -> x*x)
        			.subscribe(System.out::println);
    }
}
