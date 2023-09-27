package lecture15.hw.l15task3;

public class ConversionRateFormula implements CurrencyConvertor {
    private double userInput;

    public ConversionRateFormula(double userInput) {
        this.userInput = userInput;
    }

    @Override
    public void convertBynToUsd() {
        double usdRate = 0.40;
        if (userInput > 0)
        {
            double inUSD = userInput * usdRate;
            System.out.println(userInput + " BYN will be " + inUSD + " in USD currency.");
        }
        else
        {
          throw new IllegalArgumentException("Please provide with valid numbers");
        }

    }

    @Override
    public String toString() {
        return "ConversionRateFormula{" +
                "userInput=" + userInput +
                '}';
    }
}
