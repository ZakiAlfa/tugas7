package com.example.tugas7.data.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Restaurant{

	@SerializedName("customerReviews")
	private List<CustomerReviewsItem> customerReviews;

	@SerializedName("pictureId")
	private String pictureId;

	@SerializedName("name")
	private String name;

	@SerializedName("rating")
	private Object rating;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private String id;

	public void setCustomerReviews(List<CustomerReviewsItem> customerReviews){
		this.customerReviews = customerReviews;
	}

	public List<CustomerReviewsItem> getCustomerReviews(){
		return customerReviews;
	}

	public void setPictureId(String pictureId){
		this.pictureId = pictureId;
	}

	public String getPictureId(){
		return pictureId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRating(Object rating){
		this.rating = rating;
	}

	public Object getRating(){
		return rating;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Restaurant{" + 
			"customerReviews = '" + customerReviews + '\'' + 
			",pictureId = '" + pictureId + '\'' + 
			",name = '" + name + '\'' + 
			",rating = '" + rating + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}