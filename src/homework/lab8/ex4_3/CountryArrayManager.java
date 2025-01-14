package lab8.ex4_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(Country index) {
        return this.countries[index.getPopulation()];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        Arrays.sort(newArray, Comparator.comparingInt(Country::getPopulation));
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population 
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        Arrays.sort(newArray, Comparator.comparingInt(Country::getPopulation).reversed());
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        Arrays.sort(newArray, Comparator.comparingDouble(Country::getArea));
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        Arrays.sort(newArray, Comparator.comparingDouble(Country::getArea).reversed());
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        Arrays.sort(newArray, Comparator.comparingDouble(Country::getGdp));
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        Arrays.sort(newArray, Comparator.comparingDouble(Country::getGdp).reversed());
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        List<Country> africaCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries.add(country);
            }
        }
        return (AfricaCountry[]) africaCountries.toArray(new Country[0]);
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        List<AsiaCountry> asiaCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries.add((AsiaCountry) country);
            }
        }
        return asiaCountries.toArray(new AsiaCountry[0]);
    }


    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        List<EuropeCountry> europeCountries = new ArrayList<>();
        for(Country country : countries) {
            if(country instanceof EuropeCountry) {
                europeCountries.add((EuropeCountry) country);
            }
        }
        return europeCountries.toArray(new EuropeCountry[0]);

    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        List<NorthAmericaCountry> northAmericaCountries = new ArrayList<>();
        for(Country country : countries) {
            if(country instanceof NorthAmericaCountry) {
                northAmericaCountries.add((NorthAmericaCountry) country);
            }
        }
        return northAmericaCountries.toArray(new NorthAmericaCountry[0]);

    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        List<OceaniaCountry> oceaniaCountries = new ArrayList<>();
        for(Country country : countries) {
            if(country instanceof OceaniaCountry) {
                oceaniaCountries.add((OceaniaCountry) country);
            }
        }
        return oceaniaCountries.toArray(new OceaniaCountry[0]);

    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        List<SouthAmericaCountry> southAmericaCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries.add((SouthAmericaCountry) country);
            }
        }
        return southAmericaCountries.toArray(new SouthAmericaCountry[0]);

    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Arrays.sort(countries, Comparator.comparingInt(Country::getPopulation).reversed());
        return Arrays.copyOf(countries, Math.min(howMany, countries.length));

    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Arrays.sort(countries, Comparator.comparingInt(Country::getPopulation));
        return Arrays.copyOf(countries, Math.min(howMany, countries.length));

    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Arrays.sort(countries, Comparator.comparingDouble(Country::getArea).reversed());
        return Arrays.copyOf(countries, Math.min(howMany, countries.length));

    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Arrays.sort(countries, Comparator.comparingDouble(Country::getArea));
        return Arrays.copyOf(countries, Math.min(howMany, countries.length));

    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Arrays.sort(countries, Comparator.comparingDouble(Country::getGdp).reversed());
        return Arrays.copyOf(countries, Math.min(howMany, countries.length));

    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Arrays.sort(countries, Comparator.comparingDouble(Country::getGdp));
        return Arrays.copyOf(countries, Math.min(howMany, countries.length));

    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
