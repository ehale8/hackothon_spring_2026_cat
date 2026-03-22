using UnityEngine;
using UnityEngine.SceneManagement;

public class CatClicked : MonoBehaviour
{


    [SerializeField] private string SceneName = "WinScene";

    private void OnMouseDown()
    {
        Debug.Log("Cat found! Loading win scene...");
        SceneManager.LoadScene(SceneName);
    }
}
