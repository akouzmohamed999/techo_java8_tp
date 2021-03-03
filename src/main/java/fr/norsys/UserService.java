package fr.norsys;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

public class UserService {

    public List<User> getListFromArray(User[] userArray) {
        return null;
    }

    public List<User> getUsersByCountryName(List<User> users, String countryName) {
        return null;
    }

    public List<String> getCountriesNameFromUsers(List<User> users) {
        return null;
    }

    public List<String> getCountriesNameFromUsersDistinct(List<User> users) {
        return null;
    }

    public List<Country> getCountriesFromUsersDistinct(List<User> users) {
        return null;
    }

    public List<String> getCountriesNameFromUsersSorted(List<User> users) {
        return null;
    }

    public Boolean areAllUsersEmailsValid(List<User> users) {
        return null;
    }

    public Boolean areAllUsersEmailsNotValid(List<User> users) {
        return null;
    }

    public Boolean areAtLeastOneUsersEmailsValid(List<User> users) {
        return null;
    }

    public List<String> getCountriesNameFromUsersCustomSorted(List<User> users) {
        return null;
    }

    public String getUserEmailCombined(List<User> users) {
        return null;

    }

    public Double getUserAverageAge(List<User> users) {
        return null;
    }

    public Integer getSumOfUsersLoginHours(List<User> users) {
        return null;
    }

    public Integer getMaxOfUsersLoginHours(List<User> users) {
        return null;
    }

    public Integer getMinOfUsersLoginHours(List<User> users) {
        return null;
    }

    public IntSummaryStatistics getSummaryStatisticsFromUsersList(List<User> users) {
        return null;
    }

    public Map<String, List<User>> getGroupedUserByCountryName(List<User> users) {
        return null;
    }

    public Map<String, List<User>> getGroupedUserByCountryNameGrouping(List<User> users) {
        return null;
    }

    public String getUserEmailCombinedJoining(List<User> users) {
        return null;
    }

    public Map<Boolean, List<User>> getPartitionedUserByAge(List<User> users, int age) {
        return null;
    }

    public Map<String, Long> getGroupedUserByCountryNameNumber(List<User> users) {
        return null;
    }

    public Map<Boolean, Map<String, Long>> getPartitionedUserByAgeGroupedByCountry(List<User> users, int age) {
        return null;
    }

    public Map<String, Integer> getCountriesWithSumOfLoginHours(List<User> users) {
        return null;
    }

    public Map<String, List<String>> getUserEmailsByContryName(List<User> users) {
        return null;
    }
}
