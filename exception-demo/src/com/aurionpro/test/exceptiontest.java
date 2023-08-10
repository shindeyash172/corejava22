
	package com.aurionpro.test;

	public class exceptiontest {
		static int div = 0;
	    public static void main(String[] args) {
	    	try {
	        	int firstnumber = Integer.parseInt(args[0]);
	        	System.out.println("first");
	            int secondnumber = Integer.parseInt(args[1]);
	            System.out.println("second");
	            div = firstnumber/secondnumber;
	            System.out.println("div"+div);
	            

	        } catch (NumberFormatException e) {
	           e.printStackTrace();
	        } catch (ArrayIndexOutOfBoundsException e) {
	            e.printStackTrace();
	        }catch (ArithmeticException e) {
	            e.printStackTrace();
	        }
	    	
	    	
	    	catch (RuntimeException e) {
	    		e.printStackTrace();
	    	}catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	finally {
	    		System.out.println("Inside Finally");
	    	}
	        System.out.println("result");
	    }
}
	