package com.example.tugas7.data.response;

import com.google.gson.annotations.SerializedName;

public class RestaurantResponse{

	@SerializedName("restaurant")
	private Restaurant restaurant;

	@SerializedName("error")
	private boolean error;

	@SerializedName("message")
	private String message;

	public void setRestaurant(Restaurant restaurant){
		this.restaurant = restaurant;
	}

	public Restaurant getRestaurant(){
		return restaurant;
	}

	public void setError(boolean error){
		this.error = error;
	}

	public boolean isError(){
		return error;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"RestaurantResponse{" + 
			"restaurant = '" + restaurant + '\'' + 
			",error = '" + error + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}