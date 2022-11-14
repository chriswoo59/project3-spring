package com.cognixia.jump.project3spring.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public abstract class Food implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "food_id")
	private Long id;
		
	@Column(nullable = false)
	private String type;
	
	@Column(nullable = false)
	private double cost;
	
	private enum Veggies{Lettuce,Onions,Tomato,Pickles,Jalapeños};
	private enum Cheese{American,Blue,Cheddar,Swiss,PepperJack,RedDragon};
	private enum Extras{Bacon,FriedEgg,Avocado};
	
	@Column
	private List<Veggies> veggies;
	@Column
	private List<Extras> extras;
	@Column
	private Cheese cheese; 
		
	

	public Food(Long id, String type, double cost, ArrayList<Veggies> veggies, ArrayList<Extras> extras, Cheese cheese) {
		super();
		this.id = id;
		this.type = type;
		this.cost = cost;
		this.veggies = veggies;
		this.extras = extras;
		this.cheese = cheese;
	}

	public Food() {
		this.id = -1L;
		this.type = "blank";
		this.cost = 5.0;
		this.veggies = new ArrayList<Veggies>();
		this.extras = new ArrayList<Extras>();
		this.cheese = null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<Veggies> getTopping() {
		return veggies;
	}

	public void setTopping(List<Veggies> topping) {
		this.veggies = topping;
	}

	public List<Extras> getExtras() {
		return extras;
	}

	public void setExtras(List<Extras> extras) {
		this.extras = extras;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", type=" + type + ", cost=" + cost + ", veggies=" + veggies + ", extras=" + extras
				+ ", cheese=" + cheese + "]";
	}
	
	
}
