package edu.miu.cs.cs427.blackpanther.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.google.cloud.firestore.WriteResult;
import edu.miu.cs.cs427.blackpanther.model.User;

import java.util.concurrent.ExecutionException;

public class FirebaseService {
    public String saveUserDetails (User user) throws ExecutionException, InterruptedException {
        Firestore dbFireStore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApi = dbFireStore.collection("users").document(user.getUserName()).set(user);
        return collectionsApi.get().getUpdateTime().toString();
    }
}
