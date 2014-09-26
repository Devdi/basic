package com.devdi.basic;

import javax.validation.constraints.Min;

/**
 * Created by devdi on 9/21/14.
 */
public class Form {

   @Min(1)
   private String page;

   public String getPage() {
      return page;
   }

   public void setPage(String page) {
      this.page = page;
   }
}
