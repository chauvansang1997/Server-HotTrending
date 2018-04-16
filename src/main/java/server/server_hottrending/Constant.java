/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.server_hottrending;

/**
 *
 * @author chauvansang
 */
//Structure of html 
//<div id=trending-stories-container>
//  <div class="homepage-trending-stories generic-container"  ...>  
    //  .....
    //  we will get information in first tag md-list 
    //  <md-list ...>
    //      <md-list-item ...> 
    //          <trending-story image-url="" story-title="" new-url="" image-source="" >
    //              ...
    //          </trending-story>
    //          ...    
    //      </md-list-item>
    //  </md-list>
    //  This second md-list tag have no imformation that we need
    //  <md-list ...>
    //      ...
    //   </md-list>
//  </div>
//</div >
public class Constant {
    //<div id=trending-stories-container>
    public static final String TRENDING_STORIES_CONTAINER="trending-stories-container";
    //<md-list ...>
    public static final String MD_LIST="md-list";
    //<md-list-item ...> 
    public static final String MD_LIST_ITEM="md-list-item";
    //<trending-story image-url="" story-title="" new-url="" image-source="" >
    public static final String TRENDING_STORY="trending-story";
}
