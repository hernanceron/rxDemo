package org.sample.reactive;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;

public class Persona {
	public Observable<Persona> obtenerPersona(){
		return Observable.just(new Persona());		
	}

}
