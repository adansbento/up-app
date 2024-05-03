package br.com.abs.upapp.integration.brapi.model;

import java.util.Date;
import java.util.List;

public class ResponseStock {
     private List<AssetResponse> results;
     private Date requestedAt;
     private String took;

     public ResponseStock() {
     }


     public ResponseStock(List<AssetResponse> results, Date requestedAt, String took) {
          this.results = results;
          this.requestedAt = requestedAt;
          this.took = took;
     }

     public List<AssetResponse> getResults() {
          return results;
     }

     public void setResults(List<AssetResponse> results) {
          this.results = results;
     }

     public Date getRequestedAt() {
          return requestedAt;
     }

     public void setRequestedAt(Date requestedAt) {
          this.requestedAt = requestedAt;
     }

     public String getTook() {
          return took;
     }

     public void setTook(String took) {
          this.took = took;
     }
}
