package com.alexw.formation_flickr;

import java.util.List;

/**
 * Created by Human Booster on 17/10/2016.
 */

public class Photos {
        private String page;
        private String pages;

        public String getPage() {
                return page;
        }

        public void setPage(String page) {
                this.page = page;
        }

        public String getPages() {
                return pages;
        }

        public void setPages(String pages) {
                this.pages = pages;
        }

        public String getPerpage() {
                return perpage;
        }

        public void setPerpage(String perpage) {
                this.perpage = perpage;
        }

        public String getTotal() {
                return total;
        }

        public void setTotal(String total) {
                this.total = total;
        }

        public List<Photo> getPhoto() {
                return photo;
        }

        public void setPhoto(List<Photo> photo) {
                this.photo = photo;
        }

        private String perpage;
        private String total;
        private List<Photo> photo;

        public Photos(){

        }

}
