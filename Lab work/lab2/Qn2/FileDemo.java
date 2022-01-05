class FileDemo{
	public static void main(String[] args){
		FileDemo demo = new FileDemo();
		try {
			demo.divide(5,0);
		}catch(ArithmeticExpression e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("End");
		}
	}
	void divide(int num1,num2) throws ArithmeticException{
		if(num2 ==0){
			throw new ArithmeticException("0 is invalid");
		}
	}

}