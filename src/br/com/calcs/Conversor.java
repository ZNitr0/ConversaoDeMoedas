package br.com.calcs;

import br.com.models.Coin;
import br.com.models.CoinSearch;

public class Conversor extends CoinSearch {

    public Double convert(Double amount, String coinBase, String coinTarget) {;
        CoinSearch coinSearch = new CoinSearch();
        Coin coin = coinSearch.searchCoin(coinBase);
        Double taxa = coin.conversion_rates().get(coinTarget);
        Double conversion = amount * taxa;
        return conversion;

    }

}