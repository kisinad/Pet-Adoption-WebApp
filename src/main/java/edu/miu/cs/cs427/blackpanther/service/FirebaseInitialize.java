package edu.miu.cs.cs427.blackpanther.service;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
//import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

//@Service
public class FirebaseInitialize {

    @PostConstruct
    public void initialize() throws IOException, ExecutionException, InterruptedException {

        FileInputStream serviceAccount =
                new FileInputStream("./ServiceAccount.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://petadoptionwebadoption.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
        Firestore db = FirestoreClient.getFirestore();


        DocumentReference docRef = db.collection("users").document("alovelace");
// Add document data  with id "alovelace" using a hashmap
        Map<String, Object> data = new HashMap<>();
        data.put("first", "Ada");
        data.put("last", "Lovelace");
        data.put("born", 1815);
//asynchronously write data
        ApiFuture<WriteResult> result = docRef.set(data);
// ...
// result.get() blocks on response
        System.out.println("Update time : " + result.get().getUpdateTime());

    }



}
