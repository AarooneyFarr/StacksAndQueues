package stacks.controller;

import stacks.model.Customer;
import java.util.LinkedList;
import java.util.Stack;


public class StackController
	{
		private LinkedList<Customer> customers;
		private Stack<Customer> people;
		
		public StackController()
		{
			customers = new LinkedList<Customer>();
			people = new Stack<Customer>();
		}
		
		public void start()
		{
			customers.add(new Customer());
			customers.peek();
			customers.remove();
			
			people.push(new Customer());
			people.peek();
			people.pop();
			
		}
	}
