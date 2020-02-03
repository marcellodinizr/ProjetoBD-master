/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Marcello
 */
public class ClimbingStatistics {

    //   Date;Route;Attempted;Succeeded;SuccessPercentage
    private String date1;
    private String route;
    private String attempted;
    private String succeeded;
    private String successPercentage;

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getAttempted() {
        return attempted;
    }

    public void setAttempted(String attempted) {
        this.attempted = attempted;
    }

    public String getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(String succeeded) {
        this.succeeded = succeeded;
    }

    public String getSuccessPercentage() {
        return successPercentage;
    }

    public void setSuccessPercentage(String successPercentage) {
        this.successPercentage = successPercentage;
    }

}
