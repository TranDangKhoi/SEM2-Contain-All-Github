package com.jsonwrite;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

public class FileJsonExample {
    public static void main(String[] args) throws IOException {
        readJsonObject();
    }

    public static void writeJson() throws IOException {
        HashMap<String, Object> map = new HashMap<>();
        // Map<String, Object> map1 = new HashMap<>();
        map.put("id", 1);
        map.put("name", "Khoi");
        map.put("address", new String[] { "HN", "Viet Tri", "Minh Khai" });
        map.put("email", "khoi@fpt.edu.vn");
        map.put("active", true);

        Writer writer = new FileWriter("products.json");
        Gson gson = new Gson();
        gson.toJson(map, writer);
        writer.close();
        System.out.println("Ghi du lieu thanh cong");
        // FileWriter writer1 = new FileWriter("data.json");
    }

    public static void writeJsonObject() throws IOException {
        // Create account object
        Account account = new Account(1, "Minh", new String[] { "Trung Kính", "Ton TT" }, "minh@fpt.edu.vn", true);

        // File name
        String fileName = "product1.json";
        // Duong dan file
        Path path = Paths.get(fileName);
        Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement tree = gson.toJsonTree(account);
        gson.toJson(tree, writer);
        writer.close();
    }

    public static void writeJsonObjects() throws IOException {
        List<Account> accounts = Arrays.asList(
                new Account(1, "Đức", new String[] { "HCM", "Kim Ngưu" }, "duc@fpt.edu.vn", true),
                new Account(1, "Khôi", new String[] { "HCM", "Kim Ngưu" }, "khoi@fpt.edu.vn", true),
                new Account(1, "Minh", new String[] { "HCM", "Kim Ngưu" }, "minh@fpt.edu.vn", true));
        // Filename 
        String fileName = "user.json";
        // Duong dan file
        Path path = Paths.get(fileName);
        Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement tree = gson.toJsonTree(accounts);
        gson.toJson(tree, writer);
        writer.close();
    }

    public static void readJsonObject() throws IOException {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get("user.json"));
        List<Account> accounts = new Gson().fromJson(reader, new TypeToken<List<Account>>() {
        }.getType());
        accounts.forEach(System.out::println);
        reader.close();
    }
}
