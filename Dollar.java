class Dollar extends Money {
	
   private String currency;
	
   Dollar(int amount, String currency)  {
      super(amount, currency);
   }
	
   Money times(int multiplier)  {
      return Money.dollar(amount * multiplier);
   }

   public boolean equals(Object object)  {
      Dollar dollar = (Dollar) object;
      return amount == dollar.amount;
   }
}	