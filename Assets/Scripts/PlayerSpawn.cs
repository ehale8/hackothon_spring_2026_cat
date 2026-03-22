using UnityEngine;

public class PlayerSpawn : MonoBehaviour
{
    public Transform[] spawnPoints; 
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
