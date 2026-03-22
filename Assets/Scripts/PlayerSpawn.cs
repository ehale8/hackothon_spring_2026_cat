using UnityEngine;

public class PlayerSpawn : MonoBehaviour
{
    public Transform[] spawnPoints; // Drag the 2 spawn points here in the Inspector
    public GameObject playerPrefab;

    void Start()
    {
        int index = SceneData.TargetSpawnIndex;

        // Safety check to make sure the index exists
        if (index >= 0 && index < spawnPoints.Length)
        {
            // Move existing player 
            GameObject player = GameObject.FindGameObjectWithTag("Player");
            player.transform.position = spawnPoints[index].position;
        }
    }
}
