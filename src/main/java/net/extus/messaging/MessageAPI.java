package net.extus.messaging;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.extus.messaging.alert.AlertMessage;
import net.extus.messaging.alert.AlertResponseMessage;
import net.extus.messaging.report.ReportIdMessage;
import net.extus.messaging.report.ReportIdResponseMessage;
import net.extus.messaging.report.ReportSubmitMessage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MessageAPI {
    private static final Gson GSON = new GsonBuilder().create();
    private static final String VIOLATION_URL_API = "http://151.80.144.214:8082/api/v1/violations";
    private static final String REPORT_ID_URL_API = "http://151.80.144.214:8082/api/v1/report-id";
    private static final String REPORT_SUBMITT_URL_API = "http://151.80.144.214:8082/api/v1/report-submit";

    public static AlertResponseMessage sendAlertMessage(final AlertMessage alertMessage) {
        try {
            URL url = new URL(VIOLATION_URL_API);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-type", "application/json");

            String input = GSON.toJson(alertMessage);

            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(input.getBytes());
            outputStream.close();

            if (connection.getResponseCode() != 200) {
                System.out.println(String.format("Response Code: %s", connection.getResponseCode()));
                return null;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder output = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null) {
                output.append(line);
            }

            AlertResponseMessage responseMessage = GSON.fromJson(output.toString(), AlertResponseMessage.class);
            if (responseMessage == null)
                return null;

            if (!responseMessage.getServerId().equals(alertMessage.getServerId()))
                return null;

            if (!responseMessage.getPlayerUUID().equals(alertMessage.getPlayerUUID()))
                return null;

            if (!responseMessage.getCheatType().equals(alertMessage.getCheatType()))
                return null;

            return responseMessage;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ReportIdResponseMessage sendReportIdMessage(final ReportIdMessage reportIdMessage) {
        try {
            URL url = new URL(REPORT_ID_URL_API);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-type", "application/json");

            String input = GSON.toJson(reportIdMessage);

            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(input.getBytes());
            outputStream.close();

            if (connection.getResponseCode() != 200) {
                System.out.println(String.format("Response Code: %s", connection.getResponseCode()));
                return null;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder output = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null) {
                output.append(line);
            }

            ReportIdResponseMessage responseMessage = GSON.fromJson(output.toString(), ReportIdResponseMessage.class);
            if (responseMessage == null)
                return null;

            if (!responseMessage.getServerId().equals(reportIdMessage.getServerId()))
                return null;

            return responseMessage;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void sendReportSubmittion(final ReportSubmitMessage reportSubmitMessage) {
        try {
            URL url = new URL(REPORT_SUBMITT_URL_API);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-type", "application/json");

            String input = GSON.toJson(reportSubmitMessage);

            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(input.getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


